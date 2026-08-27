import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class bkq {
   private final Map<bmw, bkl> a = Maps.newHashMap();
   private final bkr b;
   private final int c;
   @Nullable
   private String d;
   private Supplier<bks.a> e = () -> null;
   private final ie.c<bkq> f = kb.d.f(this);

   protected bkq(bkr $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Optional<bks.a> b() {
      return Optional.ofNullable(this.e.get());
   }

   public void a(blv $$0, int $$1) {
   }

   public void a(@Nullable blf $$0, @Nullable blf $$1, blv $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(blv $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.d == null) {
         this.d = ac.a("effect", kb.d.b(this));
      }

      return this.d;
   }

   public String d() {
      return this.c();
   }

   public vb e() {
      return vb.c(this.d());
   }

   public bkr f() {
      return this.b;
   }

   public int g() {
      return this.c;
   }

   public bkq a(bmw $$0, String $$1, double $$2, bmz.a $$3) {
      this.a.put($$0, new bkq.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bkq a(Supplier<bks.a> $$0) {
      this.e = $$0;
      return this;
   }

   public Map<bmw, bkl> h() {
      return this.a;
   }

   public void a(bmy $$0) {
      for (Entry<bmw, bkl> $$1 : this.a.entrySet()) {
         bmx $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bmy $$0, int $$1) {
      for (Entry<bmw, bkl> $$2 : this.a.entrySet()) {
         bmx $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean i() {
      return this.b == bkr.a;
   }

   @Deprecated
   public ie.c<bkq> j() {
      return this.f;
   }

   class a implements bkl {
      private final UUID b;
      private final double c;
      private final bmz.a d;

      public a(UUID $$0, double $$1, bmz.a $$2) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
      }

      @Override
      public UUID a() {
         return this.b;
      }

      @Override
      public bmz a(int $$0) {
         return new bmz(this.b, bkq.this.d() + " " + $$0, this.c * (double)($$0 + 1), this.d);
      }
   }
}
