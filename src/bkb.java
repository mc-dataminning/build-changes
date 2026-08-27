import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bkb {
   private final Map<bmh, bjw> a = Maps.newHashMap();
   private final bkc b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bkd.a> e = () -> null;
   private final ib.c<bkb> f = jy.e.f(this);

   protected bkb(bkc $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bkd.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(blg $$0, int $$1) {
   }

   public void a(@Nullable bkq $$0, @Nullable bkq $$1, blg $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(blg $$0, int $$1) {
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

   public bkc f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bkb a(bmh $$0, String $$1, double $$2, bmk.a $$3) {
      this.a.put($$0, new bkb.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bkb a(Supplier<bkd.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bmh, bjw> h() {
      return this.a;
   }

   public void a(bmj $$0) {
      for (Entry<bmh, bjw> $$1 : this.a.entrySet()) {
         bmi $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bmj $$0, int $$1) {
      for (Entry<bmh, bjw> $$2 : this.a.entrySet()) {
         bmi $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bkc.a;
   }

   @Deprecated
   public ib.c<bkb> j() {
      return this.f;
   }

   class a implements bjw {
      private final UUID b;
      private final double c;
      private final bmk.a d;

      public a(UUID $$0, double $$1, bmk.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bmk a(int $$0) {
         return new bmk(this.b, bkb.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
