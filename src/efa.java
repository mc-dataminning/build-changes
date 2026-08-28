import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class efa extends edq<ego> {
   public static final int a = 10;
   private static final int b = 42;
   private static final LoadingCache<Long, List<efa.a>> c = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new efa.b());

   public efa(Codec<ego> $$0) {
      super($$0);
   }

   public static List<efa.a> a(dfd $$0) {
      azl $$1 = azl.a($$0.C());
      long $$2 = $$1.g() & 65535L;
      return (List<efa.a>)c.getUnchecked($$2);
   }

   @Override
   public boolean a(eds<ego> $$0) {
      ego $$1 = $$0.f();
      dfd $$2 = $$0.b();
      azl $$3 = $$0.d();
      je $$4 = $$0.e();
      List<efa.a> $$5 = $$1.b();
      if ($$5.isEmpty()) {
         $$5 = a($$2);
      }

      for (efa.a $$6 : $$5) {
         if ($$6.a($$4)) {
            this.a($$2, $$3, $$1, $$6);
         }
      }

      return true;
   }

   private void a(dew $$0, azl $$1, ego $$2, efa.a $$3) {
      int $$4 = $$3.c();

      for (je $$5 : je.c(new je($$3.a() - $$4, $$0.G_(), $$3.b() - $$4), new je($$3.a() + $$4, $$3.d() + 10, $$3.b() + $$4))) {
         if ($$5.d((double)$$3.a(), (double)$$5.v(), (double)$$3.b()) <= (double)($$4 * $$4 + 1) && $$5.v() < $$3.d()) {
            this.a($$0, $$5, dhl.co.o());
         } else if ($$5.v() > 65) {
            this.a($$0, $$5, dhl.a.o());
         }
      }

      if ($$3.e()) {
         int $$6 = -2;
         int $$7 = 2;
         int $$8 = 3;
         je.a $$9 = new je.a();

         for (int $$10 = -2; $$10 <= 2; $$10++) {
            for (int $$11 = -2; $$11 <= 2; $$11++) {
               for (int $$12 = 0; $$12 <= 3; $$12++) {
                  boolean $$13 = azd.a($$10) == 2;
                  boolean $$14 = azd.a($$11) == 2;
                  boolean $$15 = $$12 == 3;
                  if ($$13 || $$14 || $$15) {
                     boolean $$16 = $$10 == -2 || $$10 == 2 || $$15;
                     boolean $$17 = $$11 == -2 || $$11 == 2 || $$15;
                     duo $$18 = dhl.eW
                        .o()
                        .b(dlk.a, Boolean.valueOf($$16 && $$11 != -2))
                        .b(dlk.c, Boolean.valueOf($$16 && $$11 != 2))
                        .b(dlk.d, Boolean.valueOf($$17 && $$10 != -2))
                        .b(dlk.b, Boolean.valueOf($$17 && $$10 != 2));
                     this.a($$0, $$9.d($$3.a() + $$10, $$3.d() + $$12, $$3.b() + $$11), $$18);
                  }
               }
            }
         }
      }

      ciw $$19 = btv.E.a($$0.E(), btu.d);
      if ($$19 != null) {
         $$19.a($$2.c());
         $$19.n($$2.a());
         $$19.b((double)$$3.a() + 0.5, (double)($$3.d() + 1), (double)$$3.b() + 0.5, $$1.i() * 360.0F, 0.0F);
         $$0.b($$19);
         je $$20 = $$19.ds();
         this.a($$0, $$20.e(), dhl.F.o());
         this.a($$0, $$20, dkj.a($$0, $$20));
      }
   }

   public static class a {
      public static final Codec<efa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("centerX").orElse(0).forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("centerZ").orElse(0).forGetter($$0x -> $$0x.c),
                  Codec.INT.fieldOf("radius").orElse(0).forGetter($$0x -> $$0x.d),
                  Codec.INT.fieldOf("height").orElse(0).forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("guarded").orElse(false).forGetter($$0x -> $$0x.f)
               )
               .apply($$0, efa.a::new)
      );
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final boolean f;
      private final eyn g;

      public a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = new eyn((double)($$0 - $$2), (double)dyk.e, (double)($$1 - $$2), (double)($$0 + $$2), (double)dyk.d, (double)($$1 + $$2));
      }

      public boolean a(je $$0) {
         return kg.a($$0.u()) == kg.a(this.b) && kg.a($$0.w()) == kg.a(this.c);
      }

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }

      public boolean e() {
         return this.f;
      }

      public eyn f() {
         return this.g;
      }
   }

   static class b extends CacheLoader<Long, List<efa.a>> {
      public List<efa.a> a(Long $$0) {
         IntArrayList $$1 = ad.a(IntStream.range(0, 10), azl.a($$0));
         List<efa.a> $$2 = Lists.newArrayList();

         for (int $$3 = 0; $$3 < 10; $$3++) {
            int $$4 = azd.a(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$5 = azd.a(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$6 = $$1.get($$3);
            int $$7 = 2 + $$6 / 3;
            int $$8 = 76 + $$6 * 3;
            boolean $$9 = $$6 == 1 || $$6 == 2;
            $$2.add(new efa.a($$4, $$5, $$7, $$8, $$9));
         }

         return $$2;
      }
   }
}
