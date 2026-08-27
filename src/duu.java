import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record duu(ix<dut> e, dsy f) {
   public static final Codec<duu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dut.j.fieldOf("type").forGetter(duu::a), dsy.a.fieldOf("generator").forGetter(duu::b)).apply($$0, $$0.stable(duu::new))
   );
   public static final akl<duu> b = akl.a(lf.aT, new akm("overworld"));
   public static final akl<duu> c = akl.a(lf.aT, new akm("the_nether"));
   public static final akl<duu> d = akl.a(lf.aT, new akm("the_end"));

   public ix<dut> a() {
      return this.e;
   }

   public dsy b() {
      return this.f;
   }
}
