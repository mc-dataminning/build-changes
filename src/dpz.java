import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpz extends dlm {
   public static final MapCodec<dpz> a = b(dpz::new);
   public static final eax<ja> b = eap.S;
   public static final eaq c = eap.i;
   private final Function<dzz, ffc> d;
   private final Map<ja, ffc> e;

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   public dpz(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.a).b(c, Boolean.valueOf(true)));
      ffc $$1 = dma.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fez.c(fez.a($$1, dma.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(ja.a, $$1).build();
   }

   private Function<dzz, ffc> b(ffc $$0) {
      ffc $$1 = fez.a(dma.b(16.0, 10.0, 16.0), dma.b(8.0, 4.0, 10.0));
      ffc $$2 = fez.a($$1, $$0, fem.e);
      Map<ja, ffc> $$3 = fez.d(dma.a(4.0, 4.0, 8.0, 0.0, 8.0), new fei(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fez.a($$2, fez.a($$3.get($$2x.c(b)), fez.b(), fem.i)), new ebc[]{c});
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public dzz a(dcr $$0) {
      ja $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == ja.a.b ? ja.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dya($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return $$0.C ? null : a($$2, dwz.s, dya::a);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dya $$5) {
         $$3.a($$5);
         $$3.a(awx.ad);
      }

      return bub.a;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(div $$0, iu $$1, dzz $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.a($$1.c_($$2));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      dwx $$4 = $$1.c_($$2);
      if ($$4 instanceof dya) {
         dya.a($$1, $$2, $$0, $$3, (dya)$$4);
      }
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
