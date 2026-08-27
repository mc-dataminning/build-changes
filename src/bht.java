import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bht {
   private final Map<bka, bho> a = Maps.newHashMap();
   private final bhu b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bhv.a> e = () -> null;
   private final he.c<bht> f = jb.e.f(this);

   protected bht(bhu $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bhv.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(biy $$0, int $$1) {
   }

   public void a(@Nullable bii $$0, @Nullable bii $$1, biy $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(biy $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", jb.e.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public tf e() {
      return tf.c(this.d());
   }

   public bhu f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bht a(bka $$0, String $$1, double $$2, bkd.a $$3) {
      this.a.put($$0, new bht.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bht a(Supplier<bhv.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bka, bho> h() {
      return this.a;
   }

   public void a(bkc $$0) {
      for (Entry<bka, bho> $$1 : this.a.entrySet()) {
         bkb $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bkc $$0, int $$1) {
      for (Entry<bka, bho> $$2 : this.a.entrySet()) {
         bkb $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bhu.a;
   }

   @Deprecated
   public he.c<bht> j() {
      return this.f;
   }

   class a implements bho {
      private final UUID b;
      private final double c;
      private final bkd.a d;

      public a(UUID $$0, double $$1, bkd.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bkd a(int $$0) {
         return new bkd(this.b, bht.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
