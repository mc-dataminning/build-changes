import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dwo extends dsy {
   public static final MapCodec<dwo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(efm.a.fieldOf("settings").forGetter(dwo::g)).apply($$0, $$0.stable(dwo::new))
   );
   private final efm d;

   public dwo(efm $$0) {
      super(new dch($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dsz a(iz<ehp> $$0, dxh $$1, long $$2) {
      Stream<ix<ehp>> $$3 = this.d.c().map(jb::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dsz.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dsy> a() {
      return c;
   }

   public efm g() {
      return this.d;
   }

   @Override
   public void a(aqt $$0, dbq $$1, dxh $$2, dsx $$3) {
   }

   @Override
   public int a(daz $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dsx> a(Executor $$0, dxv $$1, dxh $$2, dbq $$3, dsx $$4) {
      List<drb> $$5 = this.d.f();
      io.a $$6 = new io.a();
      dwt $$7 = $$4.a(dwt.a.c);
      dwt $$8 = $$4.a(dwt.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         drb $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dwt.a $$2, daz $$3, dxh $$4) {
      List<drb> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         drb $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public dbj a(int $$0, int $$1, daz $$2, dxh $$3) {
      return new dbj($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? dea.a.n() : $$0x).toArray(drb[]::new));
   }

   @Override
   public void a(List<String> $$0, dxh $$1, io $$2) {
   }

   @Override
   public void a(aqt $$0, long $$1, dxh $$2, dby $$3, dbq $$4, dsx $$5, dwp.a $$6) {
   }

   @Override
   public void a(aqt $$0) {
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
