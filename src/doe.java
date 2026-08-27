import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class doe extends dkx {
   public static final Codec<doe> c = RecordCodecBuilder.create($$0 -> $$0.group(dxc.a.fieldOf("settings").forGetter(doe::g)).apply($$0, $$0.stable(doe::new)));
   private final dxc d;

   public doe(dxc $$0) {
      super(new cus($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dky a(ij<dzf> $$0, dox $$1, long $$2) {
      Stream<ih<dzf>> $$3 = this.d.c().map(il::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dky.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dkx> a() {
      return c;
   }

   public dxc g() {
      return this.d;
   }

   @Override
   public void a(ang $$0, cub $$1, dox $$2, dkw $$3) {
   }

   @Override
   public int a(ctk $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dkw> a(Executor $$0, dpl $$1, dox $$2, cub $$3, dkw $$4) {
      List<dja> $$5 = this.d.f();
      hx.a $$6 = new hx.a();
      doj $$7 = $$4.a(doj.a.c);
      doj $$8 = $$4.a(doj.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         dja $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, doj.a $$2, ctk $$3, dox $$4) {
      List<dja> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         dja $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public ctu a(int $$0, int $$1, ctk $$2, dox $$3) {
      return new ctu($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cwl.a.o() : $$0x).toArray(dja[]::new));
   }

   @Override
   public void a(List<String> $$0, dox $$1, hx $$2) {
   }

   @Override
   public void a(ang $$0, long $$1, dox $$2, cuj $$3, cub $$4, dkw $$5, dof.a $$6) {
   }

   @Override
   public void a(ang $$0) {
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
