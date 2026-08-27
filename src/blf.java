import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class blf {
   private final Map<bnl, bla> a = Maps.newHashMap();
   private final blg b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<blh.a> e = () -> null;
   private final ih.c<blf> f = kd.d.f(this);

   protected blf(blg $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<blh.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bmk $$0, int $$1) {
   }

   public void a(@Nullable blu $$0, @Nullable blu $$1, bmk $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bmk $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kd.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public vf e() {
      return vf.c(this.d());
   }

   public blg f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public blf a(bnl $$0, String $$1, double $$2, bno.a $$3) {
      this.a.put($$0, new blf.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public blf a(Supplier<blh.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bnl, bla> h() {
      return this.a;
   }

   public void a(bnn $$0) {
      for (Entry<bnl, bla> $$1 : this.a.entrySet()) {
         bnm $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bnn $$0, int $$1) {
      for (Entry<bnl, bla> $$2 : this.a.entrySet()) {
         bnm $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == blg.a;
   }

   @Deprecated
   public ih.c<blf> j() {
      return this.f;
   }

   class a implements bla {
      private final UUID b;
      private final double c;
      private final bno.a d;

      public a(UUID $$0, double $$1, bno.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bno a(int $$0) {
         return new bno(this.b, blf.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
