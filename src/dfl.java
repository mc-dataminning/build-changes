import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfl(he<dfk> e, ddy f) {
   public static final Codec<dfl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dfk.j.fieldOf("type").forGetter(dfl::a), ddy.a.fieldOf("generator").forGetter(dfl::b)).apply($$0, $$0.stable(dfl::new))
   );
   public static final acp<dfl> b = acp.a(jc.aI, new acq("overworld"));
   public static final acp<dfl> c = acp.a(jc.aI, new acq("the_nether"));
   public static final acp<dfl> d = acp.a(jc.aI, new acq("the_end"));

   public he<dfk> a() {
      return this.e;
   }

   public ddy b() {
      return this.f;
   }
}
