import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dhf extends ddy {
   public static final Codec<dhf> c = RecordCodecBuilder.create($$0 -> $$0.group(dqd.a.fieldOf("settings").forGetter(dhf::g)).apply($$0, $$0.stable(dhf::new)));
   private final dqd d;

   public dhf(dqd $$0) {
      super(new cnv($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public ddz a(hg<dsg> $$0, dhy $$1, long $$2) {
      Stream<he<dsg>> $$3 = this.d.c().map(hi::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return ddz.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends ddy> a() {
      return c;
   }

   public dqd g() {
      return this.d;
   }

   @Override
   public void a(aim $$0, cne $$1, dhy $$2, ddx $$3) {
   }

   @Override
   public int a(cmo $$0) {
      return $$0.C_() + Math.min($$0.D_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<ddx> a(Executor $$0, dim $$1, dhy $$2, cne $$3, ddx $$4) {
      List<dcb> $$5 = this.d.f();
      gu.a $$6 = new gu.a();
      dhk $$7 = $$4.a(dhk.a.c);
      dhk $$8 = $$4.a(dhk.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.D_(), $$5.size()); $$9++) {
         dcb $$10 = $$5.get($$9);
         if ($$10 != null) {
            int $$11 = $$4.C_() + $$9;

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
   public int a(int $$0, int $$1, dhk.a $$2, cmo $$3, dhy $$4) {
      List<dcb> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dcb $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.C_() + $$6 + 1;
         }
      }

      return $$3.C_();
   }

   @Override
   public cmy a(int $$0, int $$1, cmo $$2, dhy $$3) {
      return new cmy($$2.C_(), this.d.f().stream().limit((long)$$2.D_()).map($$0x -> $$0x == null ? cpo.a.n() : $$0x).toArray(dcb[]::new));
   }

   @Override
   public void a(List<String> $$0, dhy $$1, gu $$2) {
   }

   @Override
   public void a(aim $$0, long $$1, dhy $$2, cnm $$3, cne $$4, ddx $$5, dhg.a $$6) {
   }

   @Override
   public void a(aim $$0) {
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
