import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class blg {
   private final Map<bnm, blb> a = Maps.newHashMap();
   private final blh b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bli.a> e = () -> null;
   private final ih.c<blg> f = kd.d.f(this);

   protected blg(blh $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bli.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bml $$0, int $$1) {
   }

   public void a(@Nullable blv $$0, @Nullable blv $$1, bml $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bml $$0, int $$1) {
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

   public blh f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public blg a(bnm $$0, String $$1, double $$2, bnp.a $$3) {
      this.a.put($$0, new blg.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public blg a(Supplier<bli.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bnm, blb> h() {
      return this.a;
   }

   public void a(bno $$0) {
      for (Entry<bnm, blb> $$1 : this.a.entrySet()) {
         bnn $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bno $$0, int $$1) {
      for (Entry<bnm, blb> $$2 : this.a.entrySet()) {
         bnn $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == blh.a;
   }

   @Deprecated
   public ih.c<blg> j() {
      return this.f;
   }

   class a implements blb {
      private final UUID b;
      private final double c;
      private final bnp.a d;

      public a(UUID $$0, double $$1, bnp.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bnp a(int $$0) {
         return new bnp(this.b, blg.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
