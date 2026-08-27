import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dma extends dit {
   public static final Codec<dma> c = RecordCodecBuilder.create($$0 -> $$0.group(duy.a.fieldOf("settings").forGetter(dma::g)).apply($$0, $$0.stable(dma::new)));
   private final duy d;

   public dma(duy $$0) {
      super(new ctb($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public diu a(id<dxb> $$0, dmt $$1, long $$2) {
      Stream<ib<dxb>> $$3 = this.d.c().map(ig::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return diu.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dit> a() {
      return c;
   }

   public duy g() {
      return this.d;
   }

   @Override
   public void a(amh $$0, csk $$1, dmt $$2, dis $$3) {
   }

   @Override
   public int a(cru $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dis> a(Executor $$0, dnh $$1, dmt $$2, csk $$3, dis $$4) {
      List<dgw> $$5 = this.d.f();
      ht.a $$6 = new ht.a();
      dmf $$7 = $$4.a(dmf.a.c);
      dmf $$8 = $$4.a(dmf.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dgw $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.I_() + $$9;

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
   public int a(int $$0, int $$1, dmf.a $$2, cru $$3, dmt $$4) {
      List<dgw> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dgw $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public cse a(int $$0, int $$1, cru $$2, dmt $$3) {
      return new cse($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? cuv.a.o() : $$0x).toArray(dgw[]::new));
   }

   @Override
   public void a(List<String> $$0, dmt $$1, ht $$2) {
   }

   @Override
   public void a(amh $$0, long $$1, dmt $$2, css $$3, csk $$4, dis $$5, dmb.a $$6) {
   }

   @Override
   public void a(amh $$0) {
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
