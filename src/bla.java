import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bla {
   private final Map<bng, bkv> a = Maps.newHashMap();
   private final blb b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<blc.a> e = () -> null;
   private final ih.c<bla> f = kd.d.f(this);

   protected bla(blb $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<blc.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bmf $$0, int $$1) {
   }

   public void a(@Nullable blp $$0, @Nullable blp $$1, bmf $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bmf $$0, int $$1) {
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

   public vd e() {
      return vd.c(this.d());
   }

   public blb f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bla a(bng $$0, String $$1, double $$2, bnj.a $$3) {
      this.a.put($$0, new bla.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bla a(Supplier<blc.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bng, bkv> h() {
      return this.a;
   }

   public void a(bni $$0) {
      for (Entry<bng, bkv> $$1 : this.a.entrySet()) {
         bnh $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bni $$0, int $$1) {
      for (Entry<bng, bkv> $$2 : this.a.entrySet()) {
         bnh $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == blb.a;
   }

   @Deprecated
   public ih.c<bla> j() {
      return this.f;
   }

   class a implements bkv {
      private final UUID b;
      private final double c;
      private final bnj.a d;

      public a(UUID $$0, double $$1, bnj.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bnj a(int $$0) {
         return new bnj(this.b, bla.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
