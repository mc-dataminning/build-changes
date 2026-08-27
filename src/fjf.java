import com.google.common.collect.Queues;
import com.mojang.authlib.GameProfile;
import java.time.Instant;
import java.util.Deque;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class fjf {
   private static final ti a = ti.c("chat.validation_error").a(n.m, n.u);
   private final eqq b;
   private final Deque<fjf.a> c = Queues.newArrayDeque();
   private long d;
   private long e;

   public fjf(eqq $$0) {
      this.b = $$0;
   }

   public void a() {
      if (this.d != 0L) {
         if (ac.b() >= this.e + this.d) {
            fjf.a $$0 = this.c.poll();

            while ($$0 != null && !$$0.a()) {
               $$0 = this.c.poll();
            }
         }
      }
   }

   public void a(double $$0) {
      long $$1 = (long)($$0 * 1000.0);
      if ($$1 == 0L && this.d > 0L) {
         this.c.forEach(fjf.a::a);
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
      this.c.forEach(fjf.a::a);
      this.c.clear();
   }

   public boolean a(tt $$0) {
      return this.c.removeIf($$1 -> $$0.equals($$1.b()));
   }

   private boolean e() {
      return this.d > 0L && ac.b() < this.e + this.d;
   }

   private void a(@Nullable tt $$0, BooleanSupplier $$1) {
      if (this.e()) {
         this.c.add(new fjf.a($$0, $$1));
      } else {
         $$1.getAsBoolean();
      }
   }

   public void a(tx $$0, GameProfile $$1, te.a $$2) {
      boolean $$3 = this.b.m.ac().c();
      tx $$4 = $$3 ? $$0.a() : $$0;
      ti $$5 = $$2.a($$4.c());
      Instant $$6 = Instant.now();
      this.a($$0.k(), () -> {
         boolean $$6x = this.a($$2, $$0, $$5, $$1, $$3, $$6);
         fit $$7 = this.b.J();
         if ($$7 != null) {
            $$7.a($$0, $$6x);
         }

         return $$6x;
      });
   }

   public void a(UUID $$0, te.a $$1) {
      this.a(null, () -> {
         if (this.b.a($$0)) {
            return false;
         } else {
            ti $$2 = $$1.a(a);
            this.b.l.d().a($$2, null, eql.d());
            this.e = ac.b();
            return true;
         }
      });
   }

   public void a(ti $$0, te.a $$1) {
      Instant $$2 = Instant.now();
      this.a(null, () -> {
         ti $$3 = $$1.a($$0);
         this.b.l.d().a($$3);
         this.a($$1, $$0);
         this.a($$3, $$2);
         this.e = ac.b();
         return true;
      });
   }

   private boolean a(te.a $$0, tx $$1, ti $$2, GameProfile $$3, boolean $$4, Instant $$5) {
      fjh $$6 = this.a($$1, $$2, $$5);
      if ($$4 && $$6.a()) {
         return false;
      } else if (!this.b.a($$1.f()) && !$$1.i()) {
         eql $$7 = $$6.a($$1);
         tt $$8 = $$1.k();
         tl $$9 = $$1.n();
         if ($$9.a()) {
            this.b.l.d().a($$2, $$8, $$7);
            this.a($$0, $$1.c());
         } else {
            ti $$10 = $$9.b($$1.b());
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

   private void a(te.a $$0, ti $$1) {
      this.b.aV().a($$0.b($$1));
   }

   private fjh a(tx $$0, ti $$1, Instant $$2) {
      return this.a($$0.f()) ? fjh.a : fjh.a($$0, $$1, $$2);
   }

   private void a(tx $$0, te.a $$1, GameProfile $$2, fjh $$3) {
      fjg $$4 = this.b.aX().b();
      $$4.a(fjj.a($$2, $$0, $$3));
   }

   private void a(ti $$0, Instant $$1) {
      fjg $$2 = this.b.aX().b();
      $$2.a(fjj.a($$0, $$1));
   }

   public void a(ti $$0, boolean $$1) {
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

   private UUID a(ti $$0) {
      String $$1 = asj.a($$0);
      String $$2 = StringUtils.substringBetween($$1, "<", ">");
      return $$2 == null ? ac.d : this.b.aK().a($$2);
   }

   private boolean a(UUID $$0) {
      if (this.b.R() && this.b.s != null) {
         UUID $$1 = this.b.s.fP().getId();
         return $$1.equals($$0);
      } else {
         return false;
      }
   }

   static record a(@Nullable tt a, BooleanSupplier b) {
      public boolean a() {
         return this.b.getAsBoolean();
      }

      @Nullable
      public tt b() {
         return this.a;
      }

      public BooleanSupplier c() {
         return this.b;
      }
   }
}
