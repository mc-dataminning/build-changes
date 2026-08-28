import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cjd(iw e, ctq f) implements ctm<ctp, ctn> {
   public static final Codec<cjd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.b.forGetter(cjd::b), ctq.b.fieldOf("spawn_conditions").forGetter(cjd::c)).apply($$0, cjd::new)
   );
   public static final Codec<cjd> b = RecordCodecBuilder.create($$0 -> $$0.group(iw.b.forGetter(cjd::b)).apply($$0, cjd::new));
   public static final Codec<jf<cjd>> c = ald.a(mh.aH);
   public static final yw<wj, jf<cjd>> d = yu.b(mh.aH);

   private cjd(iw $$0) {
      this($$0, ctq.a);
   }

   @Override
   public List<ctm.a<ctp, ctn>> a() {
      return this.f.a();
   }

   public iw b() {
      return this.e;
   }

   public ctq c() {
      return this.f;
   }
}
