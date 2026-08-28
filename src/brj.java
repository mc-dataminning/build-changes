import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brj implements cos {
   private static final int a = aye.d(38.25F);
   private final Map<jj<bub>, brj.a> b = new Object2ObjectOpenHashMap();
   private final brk c;
   private final int d;
   private final Function<brl, lh> e;
   @Nullable
   private String f;
   private int g;
   private Optional<ave> h = Optional.empty();
   private cov i = cox.f;

   protected brj(brk $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return lc.a(lj.u, axo.b.b($$2, $$1));
      };
   }

   protected brj(brk $$0, int $$1, lh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(bsy $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsd $$0, @Nullable bsd $$1, bsy $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bsy $$0, int $$1) {
   }

   public void c(bsy $$0, int $$1) {
      this.h.ifPresent($$1x -> $$0.dP().a(null, $$0.du(), $$0.dw(), $$0.dA(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(bsy $$0, int $$1, bsd.c $$2) {
   }

   public void a(bsy $$0, int $$1, bqw $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ac.a("effect", lq.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public wu e() {
      return wu.c(this.d());
   }

   public brk f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public brj a(jj<bub> $$0, String $$1, double $$2, bue.a $$3) {
      this.b.put($$0, new brj.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public brj a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jj<bub>, bue> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((jj<bub>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bud $$0) {
      for (Entry<jj<bub>, brj.a> $$1 : this.b.entrySet()) {
         buc $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bud $$0, int $$1) {
      for (Entry<jj<bub>, brj.a> $$2 : this.b.entrySet()) {
         buc $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == brk.a;
   }

   public lh a(brl $$0) {
      return this.e.apply($$0);
   }

   public brj a(ave $$0) {
      this.h = Optional.of($$0);
      return this;
   }

   public brj a(cot... $$0) {
      this.i = cox.d.a($$0);
      return this;
   }

   @Override
   public cov i() {
      return this.i;
   }

   static record a(UUID a, double b, bue.a c) {
      public bue a(String $$0, int $$1) {
         return new bue(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}
