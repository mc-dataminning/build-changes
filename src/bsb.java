import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bsb implements cpj {
   private static final int a = ayz.d(38.25F);
   private final Map<ji<but>, bsb.a> b = new Object2ObjectOpenHashMap();
   private final bsc c;
   private final int d;
   private final Function<bsd, lg> e;
   @Nullable
   private String f;
   private int g;
   private Optional<avz> h = Optional.empty();
   private cpm i = cpo.g;

   protected bsb(bsc $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lb.a(li.u, ayj.b.b($$2, $$1));
      };
   }

   protected bsb(bsc $$0, int $$1, lg $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(btq $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsv $$0, @Nullable bsv $$1, btq $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btq $$0, int $$1) {
   }

   public void c(btq $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(btq $$0, int $$1, bsv.c $$2) {
   }

   public void a(btq $$0, int $$1, bro $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", lp.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public xp e() {
      return xp.c(this.d());
   }

   public bsc f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public bsb a(ji<but> $$0, String $$1, double $$2, buw.a $$3) {
      this.b.put($$0, new bsb.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public bsb a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ji<but>, buw> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ji<but>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(buv $$0) {
      for (Entry<ji<but>, bsb.a> $$1 : this.b.entrySet()) {
         buu $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(buv $$0, int $$1) {
      for (Entry<ji<but>, bsb.a> $$2 : this.b.entrySet()) {
         buu $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == bsc.a;
   }

   public lg a(bsd $$0) {
      return this.e.apply($$0);
   }

   public bsb a(avz $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public bsb a(cpk... $$0) {
      this.i = cpo.e.a($$0);
      return this;
   }

   @Override
   public cpm i() {
      return this.i;
   }

   static record a(UUID a, double b, buw.a c) {
      public buw a(String $$0, int $$1) {
         return new buw(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
