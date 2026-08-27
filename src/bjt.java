import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bjt {
   private final Map<blz, bjo> a = Maps.newHashMap();
   private final bju b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bjv.a> e = () -> null;
   private final ib.c<bjt> f = jy.e.f(this);

   protected bjt(bju $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bjv.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bky $$0, int $$1) {
   }

   public void a(@Nullable bki $$0, @Nullable bki $$1, bky $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bky $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", jy.e.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public ur e() {
      return ur.c(this.d());
   }

   public bju f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bjt a(blz $$0, String $$1, double $$2, bmc.a $$3) {
      this.a.put($$0, new bjt.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bjt a(Supplier<bjv.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<blz, bjo> h() {
      return this.a;
   }

   public void a(bmb $$0) {
      for (Entry<blz, bjo> $$1 : this.a.entrySet()) {
         bma $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bmb $$0, int $$1) {
      for (Entry<blz, bjo> $$2 : this.a.entrySet()) {
         bma $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bju.a;
   }

   @Deprecated
   public ib.c<bjt> j() {
      return this.f;
   }

   class a implements bjo {
      private final UUID b;
      private final double c;
      private final bmc.a d;

      public a(UUID $$0, double $$1, bmc.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bmc a(int $$0) {
         return new bmc(this.b, bjt.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
