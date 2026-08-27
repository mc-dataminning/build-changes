import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

public class dqj extends dnc {
   public static final Codec<dqj> c = RecordCodecBuilder.create($$0 -> $$0.group(dzh.a.fieldOf("settings").forGetter(dqj::g)).apply($$0, $$0.stable(dqj::new)));
   private final dzh d;

   public dqj(dzh $$0) {
      super(new cwx($$0.d()), ac.b($$0::a));
      this.d = $$0;
   }

   @Override
   public dnd a(il<ebk> $$0, drc $$1, long $$2) {
      Stream<ij<ebk>> $$3 = this.d.c().map(in::a).orElseGet(() -> $$0.b().map($$0xx -> $$0xx));
      return dnd.a($$1, $$2, this.b, $$3);
   }

   @Override
   protected Codec<? extends dnc> a() {
      return c;
   }

   public dzh g() {
      return this.d;
   }

   @Override
   public void a(apc $$0, cwg $$1, drc $$2, dnb $$3) {
   }

   @Override
   public int a(cvp $$0) {
      return $$0.J_() + Math.min($$0.K_(), this.d.f().size());
   }

   @Override
   public CompletableFuture<dnb> a(Executor $$0, drq $$1, drc $$2, cwg $$3, dnb $$4) {
      List<dlf> $$5 = this.d.f();
      hz.a $$6 = new hz.a();
      dqo $$7 = $$4.a(dqo.a.c);
      dqo $$8 = $$4.a(dqo.a.a);

      for (int $$9 = 0; $$9 < Math.min($$4.K_(), $$5.size()); $$9++) {
         dlf $$10 = $$5.get($$9);
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
   public int a(int $$0, int $$1, dqo.a $$2, cvp $$3, drc $$4) {
      List<dlf> $$5 = this.d.f();

      for (int $$6 = Math.min($$5.size(), $$3.al()) - 1; $$6 >= 0; $$6--) {
         dlf $$7 = $$5.get($$6);
         if ($$7 != null && $$2.e().test($$7)) {
            return $$3.J_() + $$6 + 1;
         }
      }

      return $$3.J_();
   }

   @Override
   public cvz a(int $$0, int $$1, cvp $$2, drc $$3) {
      return new cvz($$2.J_(), this.d.f().stream().limit((long)$$2.K_()).map($$0x -> $$0x == null ? cyq.a.o() : $$0x).toArray(dlf[]::new));
   }

   @Override
   public void a(List<String> $$0, drc $$1, hz $$2) {
   }

   @Override
   public void a(apc $$0, long $$1, drc $$2, cwo $$3, cwg $$4, dnb $$5, dqk.a $$6) {
   }

   @Override
   public void a(apc $$0) {
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
