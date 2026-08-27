import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ejv {
   public static final ekn a = ekn.a;
   public static final Codec<ejv> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eka.c.fieldOf("input_predicate").forGetter($$0x -> $$0x.c),
               eka.c.fieldOf("location_predicate").forGetter($$0x -> $$0x.d),
               ejt.c.optionalFieldOf("position_predicate", ejs.b).forGetter($$0x -> $$0x.e),
               dpy.b.fieldOf("output_state").forGetter($$0x -> $$0x.f),
               eko.c.optionalFieldOf("block_entity_modifier", a).forGetter($$0x -> $$0x.g)
            )
            .apply($$0, ejv::new)
   );
   private final eka c;
   private final eka d;
   private final ejt e;
   private final dpy f;
   private final eko g;

   public ejv(eka $$0, eka $$1, dpy $$2) {
      this($$0, $$1, ejs.b, $$2);
   }

   public ejv(eka $$0, eka $$1, ejt $$2, dpy $$3) {
      this($$0, $$1, $$2, $$3, a);
   }

   public ejv(eka $$0, eka $$1, ejt $$2, dpy $$3, eko $$4) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
   }

   public boolean a(dpy $$0, dpy $$1, im $$2, im $$3, im $$4, ayd $$5) {
      return this.c.a($$0, $$5) && this.d.a($$1, $$5) && this.e.a($$2, $$3, $$4, $$5);
   }

   public dpy a() {
      return this.f;
   }

   @Nullable
   public ty a(ayd $$0, @Nullable ty $$1) {
      return this.g.a($$0, $$1);
   }
}
