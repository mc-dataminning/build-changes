import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class foe {
   private static final vf a = vf.c("chat.validation_error").a(n.m, n.u);
   private final evg b;
   private final Deque<foe.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public foe(evg $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            foe.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(foe.a::a);
         this.c.clear();
      }

      this.d = $$1;
   }

   public void b() {
      this.c.remove().a();
   }

   public long c() {
      return (long)this.c.size();
   }

   public void d() {
      this.c.forEach(foe.a::a);
      this.c.clear();
   }

   public boolean a(vr $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable vr $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new foe.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(vv $$0, GameProfile $$1, vb.a $$2) {
      boolean $$3 = this.b.m.ad().c();
      vv $$4 = $$3 ? $$0.a() : $$0;
      vf $$5 = $$2.a($$4.c());
      Instant $$6 = Instant.now();
      this.a($$0.k(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fnr $$7 = this.b.J();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, vb.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            vf $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, evb.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(vf $$0, vb.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         vf $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(vb.a $$0, vv $$1, vf $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      fog $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.f()) && !$$1.i()) {
         evb $$7 = $$6.a($$1);
         vr $$8 = $$1.k();
         vj $$9 = $$1.n();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.c());
         } else {
            vf $$10 = $$9.b($$1.b());
            if ($$10 != null) {
               this.b.l.d().a($$0.a($$10), $$8, $$7);
               this.a($$0, $$10);
            }
         }

         this.a($$1, $$0, $$3, $$6);
         this.e = ac.b();
         return true;
      } else {
         return false;
      }
   }

   private void a(vb.a $$0, vf $$1) {
      this.b.aV().a($$0.b($$1));
   }

   private fog a(vv $$0, vf $$1, Instant $$2) {
      return this.a($$0.f()) ? fog.a : fog.a($$0, $$1, $$2);
   }

   private void a(vv $$0, vb.a $$1, GameProfile $$2, fog $$3) {
      fof $$4 = this.b.aX().b();
      $$4.a(foi.a($$2, $$0, $$3));
   }

   private void a(vf $$0, Instant $$1) {
      fof $$2 = this.b.aX().b();
      $$2.a(foi.a($$0, $$1));
   }

   public void a(vf $$0, boolean $$1) {
      if (!this.b.m.ab().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aV().b($$0);
      }
   }

   private UUID a(vf $$0) {
      String $$1 = avi.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.d : this.b.aK().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.R() && this.b.s != null) {
         UUID $$1 = this.b.s.fR().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable vr a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public vr b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
