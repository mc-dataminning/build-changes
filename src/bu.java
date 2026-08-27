import com.mojang.serialization.Codec;

public record bu(jb<bsa<?>> b) {
   public static final Codec<bu> a = jm.a(lf.v).xmap(bu::new, bu::a);

   public static bu a(bsa<?> $$0) {
      return new bu(jb.a($$0.r()));
   }

   public static bu a(awl<bsa<?>> $$0) {
      return new bu(le.g.a($$0));
   }

   public boolean b(bsa<?> $$0) {
      return $$0.a(this.b);
   }

   public jb<bsa<?>> a() {
      return this.b;
   }
}
