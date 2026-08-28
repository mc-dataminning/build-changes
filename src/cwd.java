import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cwd(jp<awj> e, xh f, float g, int h) {
   public static final Codec<cwd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awj.b.fieldOf("sound_event").forGetter(cwd::b),
               xj.a.fieldOf("description").forGetter(cwd::c),
               ays.o.fieldOf("length_in_seconds").forGetter(cwd::d),
               ays.a(0, 15).fieldOf("comparator_output").forGetter(cwd::e)
            )
            .apply($$0, cwd::new)
   );
   public static final zf<ws, cwd> b = zf.a(awj.d, cwd::b, xj.b, cwd::c, zd.j, cwd::d, zd.h, cwd::e, cwd::new);
   public static final Codec<jp<cwd>> c = ale.a(ly.L);
   public static final zf<ws, jp<cwd>> d = zd.a(ly.L, b);
   private static final int i = 20;

   public int a() {
      return azj.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<jp<cwd>> a(jr.a $$0, cvx $$1) {
      cwc $$2 = $$1.a(kt.aa);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jp<awj> b() {
      return this.e;
   }

   public xh c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
