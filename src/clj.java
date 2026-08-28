import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record clj(iw e, cue f) implements cua<cud, cub> {
   public static final Codec<clj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.b.forGetter(clj::b), cue.b.fieldOf("spawn_conditions").forGetter(clj::c)).apply($$0, clj::new)
   );
   public static final Codec<clj> b = RecordCodecBuilder.create($$0 -> $$0.group(iw.b.forGetter(clj::b)).apply($$0, clj::new));
   public static final Codec<jf<clj>> c = alf.a(mh.aT);
   public static final yy<wl, jf<clj>> d = yw.b(mh.aT);

   private clj(iw $$0) {
      this($$0, cue.a);
   }

   @Override
   public List<cua.a<cud, cub>> a() {
      return this.f.a();
   }

   public iw b() {
      return this.e;
   }

   public cue c() {
      return this.f;
   }
}
