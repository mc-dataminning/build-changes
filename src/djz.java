import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class djz extends dgw {
   public static final Codec<djz> c = RecordCodecBuilder.create($$0 -> $$0.group(aep.d(cqq.b)).apply($$0, $$0.stable(djz::new)));
   private static final int h = 2;
   private static final List<dez> i = StreamSupport.stream(jb.f.spliterator(), false).flatMap($$0 -> $$0.l().a().stream()).collect(Collectors.toList());
   private static final int j = arp.f(arp.c((float)i.size()));
   private static final int k = arp.f((float)i.size() / (float)j);
   protected static final dez d = csm.a.n();
   protected static final dez e = csm.hW.n();
   public static final int f = 70;
   public static final int g = 60;

   public djz(he.c<cqj> $$0) {
      super(new cqu($$0));
   }

   @Override
   protected Codec<? extends dgw> a() {
      return c;
   }

   @Override
   public void a(akr $$0, cqd $$1, dkw $$2, dgv $$3) {
   }

   @Override
   public void a(cqf $$0, dgv $$1, cqd $$2) {
      gu.a $$3 = new gu.a();
      cos $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = hx.a($$5, $$7);
            int $$10 = hx.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dez $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dgv> a(Executor $$0, dlk $$1, dkw $$2, cqd $$3, dgv $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dki.a $$2, cpn $$3, dkw $$4) {
      return 0;
   }

   @Override
   public cpx a(int $$0, int $$1, cpn $$2, dkw $$3) {
      return new cpx(0, new dez[0]);
   }

   @Override
   public void a(List<String> $$0, dkw $$1, gu $$2) {
   }

   public static dez a(int $$0, int $$1) {
      dez $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = arp.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(akr $$0, long $$1, dkw $$2, cql $$3, cqd $$4, dgv $$5, dke.a $$6) {
   }

   @Override
   public void a(akr $$0) {
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
      return 63;
   }
}
