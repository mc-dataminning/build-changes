import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record czj(je<awm> e, wy f, float g, int h) {
   public static final Codec<czj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awm.b.fieldOf("sound_event").forGetter(czj::b),
               xa.a.fieldOf("description").forGetter(czj::c),
               ayu.o.fieldOf("length_in_seconds").forGetter(czj::d),
               ayu.a(0, 15).fieldOf("comparator_output").forGetter(czj::e)
            )
            .apply($$0, czj::new)
   );
   public static final yw<wj, czj> b = yw.a(awm.d, czj::b, xa.b, czj::c, yu.l, czj::d, yu.h, czj::e, czj::new);
   public static final Codec<je<czj>> c = ald.a(mg.aV);
   public static final yw<wj, je<czj>> d = yu.a(mg.aV, b);
   private static final int i = 20;

   public int a() {
      return azm.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= (long)(this.a() + 20);
   }

   public static Optional<je<czj>> a(jg.a $$0, czd $$1) {
      czi $$2 = $$1.a(kj.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public je<awm> b() {
      return this.e;
   }

   public wy c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
