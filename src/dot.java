import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dot extends dlm {
   public static final Codec<dot> c = RecordCodecBuilder.create($$0 -> $$0.group(dxr.a.fieldOf("settings").forGetter(dot::g)).apply($$0, $$0.stable(dot::new)));
   private final dxr d;

   public dot(dxr $$0) {
      super(new cvh($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dln a(ij<dzu> $$0, dpm $$1, long $$2) {
      Stream<ih<dzu>> $$3 = this.d.c().map(il::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dln.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dlm> a() {
      return c;
   }

   public dxr g() {
      return this.d;
   }

   @Override
   public void a(anl $$0, cuq $$1, dpm $$2, dll $$3) {
   }

   @Override
   public int a(ctz $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dll> a(Executor $$0, dqa $$1, dpm $$2, cuq $$3, dll $$4) {
      List<djp> $$5 = this.d.f();
      hx.a $$6 = new hx.a();
      doy $$7 = $$4.a(doy.a.c);
      doy $$8 = $$4.a(doy.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         djp $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, doy.a $$2, ctz $$3, dpm $$4) {
      List<djp> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         djp $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public cuj a(int $$0, int $$1, ctz $$2, dpm $$3) {
      return new cuj($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cxa.a.o() : $$0x).toArray(djp[]::new));
   }

   @Override
   public void a(List<String> $$0, dpm $$1, hx $$2) {
   }

   @Override
   public void a(anl $$0, long $$1, dpm $$2, cuy $$3, cuq $$4, dll $$5, dou.a $$6) {
   }

   @Override
   public void a(anl $$0) {
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
