import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record cmp(cmp.a e, cue f) implements cua<cud, cub> {
   public static final Codec<cmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cmp.a.a.fieldOf("assets").forGetter(cmp::b), cue.b.fieldOf("spawn_conditions").forGetter(cmp::c)).apply($$0, cmp::new)
   );
   public static final Codec<cmp> b = RecordCodecBuilder.create($$0 -> $$0.group(cmp.a.a.fieldOf("assets").forGetter(cmp::b)).apply($$0, cmp::new));
   public static final Codec<jf<cmp>> c = alf.a(mh.bm);
   public static final yy<wl, jf<cmp>> d = yw.b(mh.bm);

   private cmp(cmp.a $$0) {
      this($$0, cue.a);
   }

   @Override
   public List<cua.a<cud, cub>> a() {
      return this.f.a();
   }

   public cmp.a b() {
      return this.e;
   }

   public cue c() {
      return this.f;
   }

   public static record a(iw b, iw c, iw d) {
      public static final Codec<cmp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iw.a.fieldOf("wild").forGetter(cmp.a::a), iw.a.fieldOf("tame").forGetter(cmp.a::b), iw.a.fieldOf("angry").forGetter(cmp.a::c))
               .apply($$0, cmp.a::new)
      );

      public iw a() {
         return this.b;
      }

      public iw b() {
         return this.c;
      }

      public iw c() {
         return this.d;
      }
   }
}
