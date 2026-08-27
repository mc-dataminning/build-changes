import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class flx {
   private static final ur a = ur.c("chat.validation_error").a(n.m, n.u);
   private final etd b;
   private final Deque<flx.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public flx(etd $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            flx.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(flx.a::a);
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
      this.c.forEach(flx.a::a);
      this.c.clear();
   }

   public boolean a(vd $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable vd $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new flx.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(vh $$0, GameProfile $$1, un.a $$2) {
      boolean $$3 = this.b.m.ad().c();
      vh $$4 = $$3 ? $$0.a() : $$0;
      ur $$5 = $$2.a($$4.c());
      Instant $$6 = Instant.now();
      this.a($$0.k(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         flk $$7 = this.b.I();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, un.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            ur $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, esy.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(ur $$0, un.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         ur $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(un.a $$0, vh $$1, ur $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      flz $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.f()) && !$$1.i()) {
         esy $$7 = $$6.a($$1);
         vd $$8 = $$1.k();
         uv $$9 = $$1.n();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.c());
         } else {
            ur $$10 = $$9.b($$1.b());
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

   private void a(un.a $$0, ur $$1) {
      this.b.aU().a($$0.b($$1));
   }

   private flz a(vh $$0, ur $$1, Instant $$2) {
      return this.a($$0.f()) ? flz.a : flz.a($$0, $$1, $$2);
   }

   private void a(vh $$0, un.a $$1, GameProfile $$2, flz $$3) {
      fly $$4 = this.b.aW().b();
      $$4.a(fmb.a($$2, $$0, $$3));
   }

   private void a(ur $$0, Instant $$1) {
      fly $$2 = this.b.aW().b();
      $$2.a(fmb.a($$0, $$1));
   }

   public void a(ur $$0, boolean $$1) {
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

   private UUID a(ur $$0) {
      String $$1 = auf.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.d : this.b.aJ().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.Q() && this.b.s != null) {
         UUID $$1 = this.b.s.fS().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable vd a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public vd b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
