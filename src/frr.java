import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class frr {
   private static final vs a = vs.c("chat.validation_error").a(n.m, n.u);
   private final eyk b;
   private final Deque<frr.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public frr(eyk $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            frr.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(frr.a::a);
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
      this.c.forEach(frr.a::a);
      this.c.clear();
   }

   public boolean a(we $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable we $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new frr.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(wi $$0, GameProfile $$1, vo.a $$2) {
      boolean $$3 = this.b.m.ad().c();
      wi $$4 = $$3 ? $$0.a() : $$0;
      vs $$5 = $$2.a($$4.d());
      Instant $$6 = Instant.now();
      this.a($$0.l(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         frb $$7 = this.b.K();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, vo.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            vs $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, eyf.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(vs $$0, vo.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         vs $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(vo.a $$0, wi $$1, vs $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      frt $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.g()) && !$$1.j()) {
         eyf $$7 = $$6.a($$1);
         we $$8 = $$1.l();
         vw $$9 = $$1.o();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.d());
         } else {
            vs $$10 = $$9.b($$1.c());
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

   private void a(vo.a $$0, vs $$1) {
      this.b.aX().a($$0.b($$1));
   }

   private frt a(wi $$0, vs $$1, Instant $$2) {
      return this.a($$0.g()) ? frt.a : frt.a($$0, $$1, $$2);
   }

   private void a(wi $$0, vo.a $$1, GameProfile $$2, frt $$3) {
      frs $$4 = this.b.aZ().b();
      $$4.a(frv.a($$2, $$0, $$3));
   }

   private void a(vs $$0, Instant $$1) {
      frs $$2 = this.b.aZ().b();
      $$2.a(frv.a($$0, $$1));
   }

   public void a(vs $$0, boolean $$1) {
      if (!this.b.m.ab().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aX().b($$0);
      }
   }

   private UUID a(vs $$0) {
      String $$1 = axf.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.d : this.b.aL().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.S() && this.b.s != null) {
         UUID $$1 = this.b.s.fU().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable we a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public we b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
