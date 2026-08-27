import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bih {
   private final Map<bkn, bic> a = Maps.newHashMap();
   private final bii b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bij.a> e = () -> null;
   private final he.c<bih> f = jb.e.f(this);

   protected bih(bii $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bij.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bjm $$0, int $$1) {
   }

   public void a(@Nullable biw $$0, @Nullable biw $$1, bjm $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bjm $$0, int $$1) {
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

   public tl e() {
      return tl.c(this.d());
   }

   public bii f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bih a(bkn $$0, String $$1, double $$2, bkq.a $$3) {
      this.a.put($$0, new bih.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bih a(Supplier<bij.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bkn, bic> h() {
      return this.a;
   }

   public void a(bkp $$0) {
      for (Entry<bkn, bic> $$1 : this.a.entrySet()) {
         bko $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bkp $$0, int $$1) {
      for (Entry<bkn, bic> $$2 : this.a.entrySet()) {
         bko $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bii.a;
   }

   @Deprecated
   public he.c<bih> j() {
      return this.f;
   }

   class a implements bic {
      private final UUID b;
      private final double c;
      private final bkq.a d;

      public a(UUID $$0, double $$1, bkq.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bkq a(int $$0) {
         return new bkq(this.b, bih.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
