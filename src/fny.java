import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fny {
   private static final vd a = vd.c("chat.validation_error").a(n.m, n.u);
   private final eva b;
   private final Deque<fny.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public fny(eva $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            fny.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(fny.a::a);
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
      this.c.forEach(fny.a::a);
      this.c.clear();
   }

   public boolean a(vp $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable vp $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new fny.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(vt $$0, GameProfile $$1, uz.a $$2) {
      boolean $$3 = this.b.m.ad().c();
      vt $$4 = $$3 ? $$0.a() : $$0;
      vd $$5 = $$2.a($$4.c());
      Instant $$6 = Instant.now();
      this.a($$0.k(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fnl $$7 = this.b.I();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, uz.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            vd $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, euv.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(vd $$0, uz.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         vd $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(uz.a $$0, vt $$1, vd $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      foa $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.f()) && !$$1.i()) {
         euv $$7 = $$6.a($$1);
         vp $$8 = $$1.k();
         vh $$9 = $$1.n();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.c());
         } else {
            vd $$10 = $$9.b($$1.b());
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

   private void a(uz.a $$0, vd $$1) {
      this.b.aU().a($$0.b($$1));
   }

   private foa a(vt $$0, vd $$1, Instant $$2) {
      return this.a($$0.f()) ? foa.a : foa.a($$0, $$1, $$2);
   }

   private void a(vt $$0, uz.a $$1, GameProfile $$2, foa $$3) {
      fnz $$4 = this.b.aW().b();
      $$4.a(foc.a($$2, $$0, $$3));
   }

   private void a(vd $$0, Instant $$1) {
      fnz $$2 = this.b.aW().b();
      $$2.a(foc.a($$0, $$1));
   }

   public void a(vd $$0, boolean $$1) {
      if (!this.b.m.ab().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aU().b($$0);
      }
   }

   private UUID a(vd $$0) {
      String $$1 = avd.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.d : this.b.aJ().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.Q() && this.b.s != null) {
         UUID $$1 = this.b.s.fR().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable vp a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public vp b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
