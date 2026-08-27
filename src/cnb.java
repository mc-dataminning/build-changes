import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cnb implements cmp<bgx> {
   protected final cmm a;
   protected final cjl b;
   private final cmt<?> d;
   private final cms<?> e;
   protected final String c;

   public cnb(cmt<?> $$0, cms<?> $$1, String $$2, cmm $$3, cjl $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cmt<?> e() {
      return this.d;
   }

   @Override
   public cms<?> an_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cjl a(hr $$0) {
      return this.b;
   }

   @Override
   public hn<cmm> a() {
      hn<cmm> $$0 = hn.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cjl a(bgx $$0, hr $$1) {
      return this.b.p();
   }

   public static class a<T extends cnb> implements cms<T> {
      private static final MapCodec<cjl> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(jb.i.q().fieldOf("result").forGetter(cjl::d), Codec.INT.fieldOf("count").forGetter(cjl::L)).apply($$0, cjl::new)
      );
      final cnb.a.a<T> x;
      private final Codec<T> z;

      protected a(cnb.a.a<T> $$0) {
         this.x = $$0;
         this.z = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     arj.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cmm.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     y.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.z;
      }

      public T b(so $$0) {
         String $$1 = $$0.s();
         cmm $$2 = cmm.b($$0);
         cjl $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(so $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cnb> {
         T create(String var1, cmm var2, cjl var3);
      }
   }
}
