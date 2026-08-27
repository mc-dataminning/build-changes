import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dlf extends dhy {
   public static final Codec<dlf> c = RecordCodecBuilder.create($$0 -> $$0.group(dud.a.fieldOf("settings").forGetter(dlf::g)).apply($$0, $$0.stable(dlf::new)));
   private final dud d;

   public dlf(dud $$0) {
      super(new csi($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dhz a(id<dwg> $$0, dly $$1, long $$2) {
      Stream<ib<dwg>> $$3 = this.d.c().map(ig::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dhz.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dhy> a() {
      return c;
   }

   public dud g() {
      return this.d;
   }

   @Override
   public void a(alx $$0, crr $$1, dly $$2, dhx $$3) {
   }

   @Override
   public int a(crb $$0) {
      return $$0.I_() + Math.min($$0.J_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dhx> a(Executor $$0, dmm $$1, dly $$2, crr $$3, dhx $$4) {
      List<dgb> $$5 = this.d.f();
      ht.a $$6 = new ht.a();
      dlk $$7 = $$4.a(dlk.a.c);
      dlk $$8 = $$4.a(dlk.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.J_(), $$5.size()); $$9++) {
         dgb $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dlk.a $$2, crb $$3, dly $$4) {
      List<dgb> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.aj()) - 1; $$6 >= 0; $$6--) {
         dgb $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.I_() + $$6 + 1;
         }
      }

      return $$3.I_();
   }

   @Override
   public crl a(int $$0, int $$1, crb $$2, dly $$3) {
      return new crl($$2.I_(), this.d.f().stream().limit((long)$$2.J_()).map($$0x -> $$0x == null ? cuc.a.o() : $$0x).toArray(dgb[]::new));
   }

   @Override
   public void a(List<String> $$0, dly $$1, ht $$2) {
   }

   @Override
   public void a(alx $$0, long $$1, dly $$2, crz $$3, crr $$4, dhx $$5, dlg.a $$6) {
   }

   @Override
   public void a(alx $$0) {
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
