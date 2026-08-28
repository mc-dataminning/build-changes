import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class edd extends dzj {
   public static final MapCodec<edd> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(emf.a.fieldOf("settings").forGetter(edd::h)).apply($$0, $$0.stable(edd::new))
   );
   private final emf d;

   public edd(emf $$0) {
      super(new din($$0.d()), ae.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dzk a(js<eoi> $$0, edw $$1, long $$2) {
      Stream<jq<eoi>> $$3 = this.d.c().map(ju::a).orElseGet(() -> $$0.c().map($$0xx -> $$0xx));
      return dzk.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected MapCodec<? extends dzj> b() {
      return c;
   }

   public emf h() {
      return this.d;
   }

   @Override
   public void a(asp $$0, dhw $$1, edw $$2, dzi $$3) {
   }

   @Override
   public int a(dhc $$0) {
      return $$0.L_() + Math.min($$0.M_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dzi> a(eek $$0, edw $$1, dhw $$2, dzi $$3) {
      List<dxn> $$4 = this.d.f();
      jh.a $$5 = new jh.a();
      edi $$6 = $$3.a(edi.a.c);
      edi $$7 = $$3.a(edi.a.a);

      for (int $$8 = 0; $$8 < Math.min($$3.M_(), $$4.size()); $$8++) {
         dxn $$9 = $$4.get($$8);
         if ($$9 != null) {
            int $$10 = $$3.L_() + $$8;

            for (int $$11 = 0; $$11 < 16; $$11++) {
               for (int $$12 = 0; $$12 < 16; $$12++) {
                  $$3.a($$5.d($$11, $$10, $$12), $$9, false);
                  $$6.a($$11, $$10, $$12, $$9);
                  $$7.a($$11, $$10, $$12, $$9);
               }
            }
         }
      }

      return CompletableFuture.completedFuture($$3);
   }

   @Override
   public int a(int $$0, int $$1, edi.a $$2, dhc $$3, edw $$4) {
      List<dxn> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size() - 1, $$3.am()); $$6 >= 0; $$6--) {
         dxn $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.L_() + $$6 + 1;
         }
      }

      return $$3.L_();
   }

   @Override
   public dhm a(int $$0, int $$1, dhc $$2, edw $$3) {
      return new dhm($$2.L_(), this.d.f().stream().limit((long)$$2.M_()).map($$0x -> $$0x == null ? dkg.a.m() : $$0x).toArray(dxn[]::new));
   }

   @Override
   public void a(List<String> $$0, edw $$1, jh $$2) {
   }

   @Override
   public void a(asp $$0, long $$1, edw $$2, die $$3, dhw $$4, dzi $$5) {
   }

   @Override
   public void a(asp $$0) {
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
