import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dnt extends dkm {
   public static final Codec<dnt> c = RecordCodecBuilder.create($$0 -> $$0.group(dwr.a.fieldOf("settings").forGetter(dnt::g)).apply($$0, $$0.stable(dnt::new)));
   private final dwr d;

   public dnt(dwr $$0) {
      super(new cui($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dkn a(ih<dyu> $$0, dom $$1, long $$2) {
      Stream<ie<dyu>> $$3 = this.d.c().map(ij::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dkn.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dkm> a() {
      return c;
   }

   public dwr g() {
      return this.d;
   }

   @Override
   public void a(amw $$0, ctr $$1, dom $$2, dkl $$3) {
   }

   @Override
   public int a(cta $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dkl> a(Executor $$0, dpa $$1, dom $$2, ctr $$3, dkl $$4) {
      List<dip> $$5 = this.d.f();
      hv.a $$6 = new hv.a();
      dny $$7 = $$4.a(dny.a.c);
      dny $$8 = $$4.a(dny.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         dip $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.J_() + $$9;

            for (int $$12 = 0; $$12 < 16; $$12++) {
               for (int $$13 = 0; $$13 < 16; $$13++) {
                  $$4.a($$6.d($$12, $$11, $$13), $$10, false);
                  $$7.a($$12, $$11, $$13, $$10);
                  $$8.a($$12, $$11, $$13, $$10);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dny.a $$2, cta $$3, dom $$4) {
      List<dip> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.ak()) - 1; $$6 >= 0; $$6--) {
         dip $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public ctk a(int $$0, int $$1, cta $$2, dom $$3) {
      return new ctk($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cwb.a.o() : $$0x).toArray(dip[]::new));
   }

   @Override
   public void a(List<String> $$0, dom $$1, hv $$2) {
   }

   @Override
   public void a(amw $$0, long $$1, dom $$2, ctz $$3, ctr $$4, dkl $$5, dnu.a $$6) {
   }

   @Override
   public void a(amw $$0) {
   }

   @Override
   public int f() {
      return 0;
   }

   @Override
   public int d() {
      return 384;
   }

   @Override
   public int e() {
      return -63;
   }
}
