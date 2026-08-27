import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bje {
   private final Map<blk, biz> a = Maps.newHashMap();
   private final bjf b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bjg.a> e = () -> null;
   private final ib.c<bje> f = jy.e.f(this);

   protected bje(bjf $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bjg.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(bkj $$0, int $$1) {
   }

   public void a(@Nullable bjt $$0, @Nullable bjt $$1, bkj $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bkj $$0, int $$1) {
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

   public ui e() {
      return ui.c(this.d());
   }

   public bjf f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bje a(blk $$0, String $$1, double $$2, bln.a $$3) {
      this.a.put($$0, new bje.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bje a(Supplier<bjg.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<blk, biz> h() {
      return this.a;
   }

   public void a(blm $$0) {
      for (Entry<blk, biz> $$1 : this.a.entrySet()) {
         bll $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(blm $$0, int $$1) {
      for (Entry<blk, biz> $$2 : this.a.entrySet()) {
         bll $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bjf.a;
   }

   @Deprecated
   public ib.c<bje> j() {
      return this.f;
   }

   class a implements biz {
      private final UUID b;
      private final double c;
      private final bln.a d;

      public a(UUID $$0, double $$1, bln.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bln a(int $$0) {
         return new bln(this.b, bje.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
