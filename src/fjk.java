import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fjk {
   private static final tm a = tm.c("chat.validation_error").a(n.m, n.u);
   private final eqv b;
   private final Deque<fjk.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public fjk(eqv $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            fjk.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(fjk.a::a);
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
      this.c.forEach(fjk.a::a);
      this.c.clear();
   }

   public boolean a(tx $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable tx $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new fjk.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(ub $$0, GameProfile $$1, ti.a $$2) {
      boolean $$3 = this.b.m.ac().c();
      ub $$4 = $$3 ? $$0.a() : $$0;
      tm $$5 = $$2.a($$4.c());
      Instant $$6 = Instant.now();
      this.a($$0.k(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fiy $$7 = this.b.J();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, ti.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            tm $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, eqq.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(tm $$0, ti.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         tm $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(ti.a $$0, ub $$1, tm $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      fjm $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.f()) && !$$1.i()) {
         eqq $$7 = $$6.a($$1);
         tx $$8 = $$1.k();
         tp $$9 = $$1.n();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.c());
         } else {
            tm $$10 = $$9.b($$1.b());
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

   private void a(ti.a $$0, tm $$1) {
      this.b.aV().a($$0.b($$1));
   }

   private fjm a(ub $$0, tm $$1, Instant $$2) {
      return this.a($$0.f()) ? fjm.a : fjm.a($$0, $$1, $$2);
   }

   private void a(ub $$0, ti.a $$1, GameProfile $$2, fjm $$3) {
      fjl $$4 = this.b.aX().b();
      $$4.a(fjo.a($$2, $$0, $$3));
   }

   private void a(tm $$0, Instant $$1) {
      fjl $$2 = this.b.aX().b();
      $$2.a(fjo.a($$0, $$1));
   }

   public void a(tm $$0, boolean $$1) {
      if (!this.b.m.aa().c() || !this.b.a(this.a($$0))) {
         if ($$1) {
            this.b.l.a($$0, false);
         } else {
            this.b.l.d().a($$0);
            this.a($$0, Instant.now());
         }

         this.b.aV().b($$0);
      }
   }

   private UUID a(tm $$0) {
      String $$1 = aso.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.d : this.b.aK().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.R() && this.b.s != null) {
         UUID $$1 = this.b.s.fQ().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable tx a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public tx b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
