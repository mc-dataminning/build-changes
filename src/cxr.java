import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cxr implements cxd<bpf> {
   protected final cxa a;
   protected final csz b;
   private final cxi<?> d;
   private final cxh<?> e;
   protected final String c;

   public cxr(cxi<?> $$0, cxh<?> $$1, String $$2, cxa $$3, csz $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public cxi<?> e() {
      return this.d;
   }

   @Override
   public cxh<?> ao_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public csz a(iy.a $$0) {
      return this.b;
   }

   @Override
   public jf<cxa> a() {
      jf<cxa> $$0 = jf.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public csz a(bpf $$0, iy.a $$1) {
      return this.b.r();
   }

   public interface a<T extends cxr> {
      T create(String var1, cxa var2, csz var3);
   }

   public static class b<T extends cxr> implements cxh<T> {
      final cxr.a<T> x;
      private final Codec<T> y;
      private final ys<wf, T> z;

      protected b(cxr.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     axh.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     cxa.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     csz.a.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = ys.a(yq.k, $$0x -> $$0x.c, cxa.b, $$0x -> $$0x.a, csz.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      @Override
      public ys<wf, T> b() {
         return this.z;
      }
   }
}
