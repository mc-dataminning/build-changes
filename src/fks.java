import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Instant;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fks extends fkt {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 25;
   private static final ws c = ws.c("recover_world.title").a(n.r);
   private static final ws d = ws.c("recover_world.bug_tracker");
   private static final ws r = ws.c("recover_world.restore");
   private static final ws s = ws.c("recover_world.no_fallback");
   private static final ws u = ws.c("recover_world.done.title");
   private static final ws v = ws.c("recover_world.done.success");
   private static final ws w = ws.c("recover_world.done.failed");
   private static final ws x = ws.c("recover_world.issue.none").a(n.k);
   private static final ws y = ws.c("recover_world.issue.missing_file").a(n.m);
   private final BooleanConsumer z;
   private final fil A = fil.d().a(8);
   private final ws B;
   private final ffo C;
   private final ffo D;
   private final enq.c E;

   public fks(fcu $$0, BooleanConsumer $$1, enq.c $$2) {
      super(c);
      this.z = $$1;
      this.B = ws.a("recover_world.message", ws.b($$2.f()).a(n.h));
      this.C = new ffo(this.B, $$0.h);
      this.E = $$2;
      Exception $$3 = this.a($$2, false);
      Exception $$4 = this.a($$2, true);
      ws $$5 = ws.i().b(this.a($$2, false, $$3)).f("\n").b(this.a($$2, true, $$4));
      this.D = new ffo($$5, $$0.h);
      boolean $$6 = $$3 != null && $$4 == null;
      this.A.c().b();
      this.A.a(new fgb(this.l, $$0.h));
      this.A.a(this.C.b(true));
      this.A.a(this.D);
      fil $$7 = fil.e().a(5);
      $$7.a(feu.a(d, fjk.b(this, "https://aka.ms/snapshotbugs?ref=game")).b(120, 20).a());
      $$7.a(feu.a(r, $$1x -> this.a($$0)).b(120, 20).a($$6 ? null : fgf.a(s)).a()).j = $$6;
      this.A.a($$7);
      this.A.a(feu.a(wr.k, $$0x -> this.d()).b(120, 20).a());
      this.A.a(this::c);
   }

   private void a(fcu $$0) {
      Exception $$1 = this.a(this.E, false);
      Exception $$2 = this.a(this.E, true);
      if ($$1 != null && $$2 == null) {
         $$0.d(new fjz(ws.c("recover_world.restoring")));
         fpl.a(this.E);
         if (this.E.n()) {
            $$0.a(new fjl(this.z, u, v, wr.j, wr.k));
         } else {
            $$0.a(new fjf(() -> this.z.accept(false), u, w));
         }
      } else {
         a.error(
            "Failed to recover world, files not as expected. level.dat: {}, level.dat_old: {}",
            $$1 != null ? $$1.getMessage() : "no issues",
            $$2 != null ? $$2.getMessage() : "no issues"
         );
         $$0.a(new fjf(() -> this.z.accept(false), u, w));
      }
   }

   private ws a(enq.c $$0, boolean $$1, @Nullable Exception $$2) {
      if ($$1 && $$2 instanceof FileNotFoundException) {
         return ws.i();
      } else {
         xg $$3 = ws.i();
         Instant $$4 = $$0.a($$1);
         xg $$5 = $$4 != null ? ws.b(fpu.a.format($$4)) : ws.c("recover_world.state_entry.unknown");
         $$3.b(ws.a("recover_world.state_entry", $$5.a(n.h)));
         if ($$2 == null) {
            $$3.b(x);
         } else if ($$2 instanceof FileNotFoundException) {
            $$3.b(y);
         } else if ($$2 instanceof up) {
            $$3.b(ws.b($$2.getCause().toString()).a(n.m));
         } else {
            $$3.b(ws.b($$2.toString()).a(n.m));
         }

         return $$3;
      }
   }

   @Nullable
   private Exception a(enq.c $$0, boolean $$1) {
      try {
         if (!$$1) {
            $$0.a($$0.h());
         } else {
            $$0.a($$0.i());
         }

         return null;
      } catch (uj | up | IOException var4) {
         return var4;
      }
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.c();
   }

   @Override
   protected void c() {
      this.D.d(this.n - 50);
      this.C.d(this.n - 50);
      this.A.a();
      fif.a(this.A, this.G());
   }

   @Override
   public ws i() {
      return wr.a(super.i(), this.B);
   }

   @Override
   public void d() {
      this.z.accept(false);
   }
}
