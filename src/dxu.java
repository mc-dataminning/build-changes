import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dxu extends due {
   public static final MapCodec<dxu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(egt.a.fieldOf("settings").forGetter(dxu::h)).apply($$0, $$0.stable(dxu::new))
   );
   private final egt d;

   public dxu(egt $$0) {
      super(new ddo($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public duf a(jl<eiw> $$0, dyn $$1, long $$2) {
      Stream<jj<eiw>> $$3 = this.d.c().map(jn::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return duf.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends due> b() {
      return c;
   }

   public egt h() {
      return this.d;
   }

   @Override
   public void a(aqr $$0, dcx $$1, dyn $$2, dud $$3) {
   }

   @Override
   public int a(dcf $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dud> a(Executor $$0, dzb $$1, dyn $$2, dcx $$3, dud $$4) {
      List<dsh> $$5 = this.d.f();
      ja.a $$6 = new ja.a();
      dxz $$7 = $$4.a(dxz.a.c);
      dxz $$8 = $$4.a(dxz.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dsh $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dxz.a $$2, dcf $$3, dyn $$4) {
      List<dsh> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.am()) - 1; $$6 >= 0; $$6--) {
         dsh $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dcp a(int $$0, int $$1, dcf $$2, dyn $$3) {
      return new dcp($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dfh.a.o() : $$0x).toArray(dsh[]::new));
   }

   @Override
   public void a(List<String> $$0, dyn $$1, ja $$2) {
   }

   @Override
   public void a(aqr $$0, long $$1, dyn $$2, ddf $$3, dcx $$4, dud $$5, dxv.a $$6) {
   }

   @Override
   public void a(aqr $$0) {
   }

   @Override
   public int g() {
      return 0;
   }

   @Override
   public int e() {
      return 384;
   }

   @Override
   public int f() {
      return -63;
   }
}
