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

public class ejb extends ehr<ekp> {
   public static final int a = 10;
   private static final int b = 42;
   private static final LoadingCache<Long, List<ejb.a>> c = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new ejb.b());

   public ejb(Codec<ekp> $$0) {
      super($$0);
   }

   public static List<ejb.a> a(dio $$0) {
      azs $$1 = azs.a($$0.E());
      long $$2 = $$1.g() & 65535L;
      return (List<ejb.a>)c.getUnchecked($$2);
   }

   @Override
   public boolean a(eht<ekp> $$0) {
      ekp $$1 = $$0.f();
      dio $$2 = $$0.b();
      azs $$3 = $$0.d();
      jj $$4 = $$0.e();
      List<ejb.a> $$5 = $$1.b();
      if ($$5.isEmpty()) {
         $$5 = a($$2);
      }

      for (ejb.a $$6 : $$5) {
         if ($$6.a($$4)) {
            this.a($$2, $$3, $$1, $$6);
         }
      }

      return true;
   }

   private void a(dig $$0, azs $$1, ekp $$2, ejb.a $$3) {
      int $$4 = $$3.c();

      for (jj $$5 : jj.c(new jj($$3.a() - $$4, $$0.G_(), $$3.b() - $$4), new jj($$3.a() + $$4, $$3.d() + 10, $$3.b() + $$4))) {
         if ($$5.d((double)$$3.a(), (double)$$5.v(), (double)$$3.b()) <= (double)($$4 * $$4 + 1) && $$5.v() < $$3.d()) {
            this.a($$0, $$5, dkw.cv.m());
         } else if ($$5.v() > 65) {
            this.a($$0, $$5, dkw.a.m());
         }
      }

      if ($$3.e()) {
         int $$6 = -2;
         int $$7 = 2;
         int $$8 = 3;
         jj.a $$9 = new jj.a();

         for (int $$10 = -2; $$10 <= 2; $$10++) {
            for (int $$11 = -2; $$11 <= 2; $$11++) {
               for (int $$12 = 0; $$12 <= 3; $$12++) {
                  boolean $$13 = azk.a($$10) == 2;
                  boolean $$14 = azk.a($$11) == 2;
                  boolean $$15 = $$12 == 3;
                  if ($$13 || $$14 || $$15) {
                     boolean $$16 = $$10 == -2 || $$10 == 2 || $$15;
                     boolean $$17 = $$11 == -2 || $$11 == 2 || $$15;
                     dym $$18 = dkw.fk
                        .m()
                        .b(doy.a, Boolean.valueOf($$16 && $$11 != -2))
                        .b(doy.c, Boolean.valueOf($$16 && $$11 != 2))
                        .b(doy.d, Boolean.valueOf($$17 && $$10 != -2))
                        .b(doy.b, Boolean.valueOf($$17 && $$10 != 2));
                     this.a($$0, $$9.d($$3.a() + $$10, $$3.d() + $$12, $$3.b() + $$11), $$18);
                  }
               }
            }
         }
      }

      clf $$19 = bwb.R.a($$0.a(), bwa.d);
      if ($$19 != null) {
         $$19.a($$2.c());
         $$19.m($$2.a());
         $$19.b((double)$$3.a() + 0.5, (double)($$3.d() + 1), (double)$$3.b() + 0.5, $$1.i() * 360.0F, 0.0F);
         $$0.b($$19);
         jj $$20 = $$19.dv();
         this.a($$0, $$20.e(), dkw.I.m());
         this.a($$0, $$20, dnv.a($$0, $$20));
      }
   }

   public static class a {
      public static final Codec<ejb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("centerX").orElse(0).forGetter($$0x -> $$0x.b),
                  Codec.INT.fieldOf("centerZ").orElse(0).forGetter($$0x -> $$0x.c),
                  Codec.INT.fieldOf("radius").orElse(0).forGetter($$0x -> $$0x.d),
                  Codec.INT.fieldOf("height").orElse(0).forGetter($$0x -> $$0x.e),
                  Codec.BOOL.fieldOf("guarded").orElse(false).forGetter($$0x -> $$0x.f)
               )
               .apply($$0, ejb.a::new)
      );
      private final int b;
      private final int c;
      private final int d;
      private final int e;
      private final boolean f;
      private final fcp g;

      public a(int $$0, int $$1, int $$2, int $$3, boolean $$4) {
         this.b = $$0;
         this.c = $$1;
         this.d = $$2;
         this.e = $$3;
         this.f = $$4;
         this.g = new fcp((double)($$0 - $$2), (double)ecj.e, (double)($$1 - $$2), (double)($$0 + $$2), (double)ecj.d, (double)($$1 + $$2));
      }

      public boolean a(jj $$0) {
         return kl.a($$0.u()) == kl.a(this.b) && kl.a($$0.w()) == kl.a(this.c);
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

      public fcp f() {
         return this.g;
      }
   }

   static class b extends CacheLoader<Long, List<ejb.a>> {
      public List<ejb.a> a(Long $$0) {
         IntArrayList $$1 = af.a(IntStream.range(0, 10), azs.a($$0));
         List<ejb.a> $$2 = Lists.newArrayList();

         for (int $$3 = 0; $$3 < 10; $$3++) {
            int $$4 = azk.a(42.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$5 = azk.a(42.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 10) * (double)$$3)));
            int $$6 = $$1.get($$3);
            int $$7 = 2 + $$6 / 3;
            int $$8 = 76 + $$6 * 3;
            boolean $$9 = $$6 == 1 || $$6 == 2;
            $$2.add(new ejb.a($$4, $$5, $$7, $$8, $$9));
         }

         return $$2;
      }
   }
}
