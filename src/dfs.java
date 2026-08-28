import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfs(jf<czu> c, int d, ki e) {
   private static final Codec<dfs> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               czu.e.fieldOf("id").forGetter(dfs::b),
               ayw.a(1, 99).optionalFieldOf("count", 1).forGetter(dfs::c),
               ki.b.optionalFieldOf("components", ki.a).forGetter(dfs::d)
            )
            .apply($$0, dfs::new)
   );
   public static final Codec<dfs> a = Codec.withAlternative(f, czu.e, $$0 -> new dfs((czu)$$0.a())).validate(dfs::a);
   public static final yy<wl, dfs> b = yy.a(czu.f, dfs::b, yw.h, dfs::c, ki.c, dfs::d, dfs::new);

   public dfs(czu $$0) {
      this($$0.e(), 1, ki.a);
   }

   private static DataResult<dfs> a(dfs $$0) {
      return czy.a(new czy($$0.c, $$0.d, $$0.e)).map($$1 -> $$0);
   }

   public czy a(czy $$0) {
      czy $$1 = $$0.a(this.c.a(), this.d);
      $$1.b(this.e);
      return $$1;
   }

   public boolean b(czy $$0) {
      czy $$1 = this.a($$0);
      return czy.a($$0, $$1);
   }

   public dgb a() {
      return new dgb.f(new czy(this.c, this.d, this.e));
   }

   public jf<czu> b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public ki d() {
      return this.e;
   }
}
