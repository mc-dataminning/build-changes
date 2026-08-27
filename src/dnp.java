import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class dnp extends dkm {
   public static final Codec<dnp> c = RecordCodecBuilder.create($$0 -> $$0.group(agr.d(cue.b)).apply($$0, $$0.stable(dnp::new)));
   private static final int h = 2;
   private static final List<dip> i = StreamSupport.stream(kb.e.spliterator(), false).flatMap($$0 -> $$0.n().a().stream()).collect(Collectors.toList());
   private static final int j = aty.f(aty.c((float)i.size()));
   private static final int k = aty.f((float)i.size() / (float)j);
   protected static final dip d = cwb.a.o();
   protected static final dip e = cwb.hW.o();
   public static final int f = 70;
   public static final int g = 60;

   public dnp(ie.c<ctx> $$0) {
      super(new cui($$0));
   }

   @Override
   protected Codec<? extends dkm> a() {
      return c;
   }

   @Override
   public void a(amw $$0, ctr $$1, dom $$2, dkl $$3) {
   }

   @Override
   public void a(ctt $$0, dkl $$1, ctr $$2) {
      hv.a $$3 = new hv.a();
      csf $$4 = $$1.f();
      int $$5 = $$4.e;
      int $$6 = $$4.f;

      for (int $$7 = 0; $$7 < 16; $$7++) {
         for (int $$8 = 0; $$8 < 16; $$8++) {
            int $$9 = ix.a($$5, $$7);
            int $$10 = ix.a($$6, $$8);
            $$0.a($$3.d($$9, 60, $$10), e, 2);
            dip $$11 = a($$9, $$10);
            $$0.a($$3.d($$9, 70, $$10), $$11, 2);
         }
      }
   }

   @Override
   public CompletableFuture<dkl> a(Executor $$0, dpa $$1, dom $$2, ctr $$3, dkl $$4) {
      return CompletableFuture.completedFuture($$4);
   }

   @Override
   public int a(int $$0, int $$1, dny.a $$2, cta $$3, dom $$4) {
      return 0;
   }

   @Override
   public ctk a(int $$0, int $$1, cta $$2, dom $$3) {
      return new ctk(0, new dip[0]);
   }

   @Override
   public void a(List<String> $$0, dom $$1, hv $$2) {
   }

   public static dip a(int $$0, int $$1) {
      dip $$2 = d;
      if ($$0 > 0 && $$1 > 0 && $$0 % 2 != 0 && $$1 % 2 != 0) {
         $$0 /= 2;
         $$1 /= 2;
         if ($$0 <= j && $$1 <= k) {
            int $$3 = aty.a($$0 * j + $$1);
            if ($$3 < i.size()) {
               $$2 = i.get($$3);
            }
         }
      }

      return $$2;
   }

   @Override
   public void a(amw $$0, long $$1, dom $$2, ctz $$3, ctr $$4, dkl $$5, dnu.a $$6) {
   }

   @Override
   public void a(amw $$0) {
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
