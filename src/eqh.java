import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqh extends epw {
   public static final Codec<eqh> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akg.a(le.aU).fieldOf("name").forGetter($$0x -> $$0x.b),
                  axh.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  ld.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eqh::new)
   );
   private final akg<eoq> b;
   private final long c;
   private final iw<dno<?>> d;

   private eqh(List<erq> $$0, akg<eoq> $$1, long $$2, iw<dno<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public epy b() {
      return epz.v;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         $$0.b(ka.ab, new cwa(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eor $$0) {
      super.a($$0);
      if ($$0.a().a(le.aU, this.b).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b.a());
      }
   }

   public static epw.a<?> a(dno<?> $$0, akg<eoq> $$1) {
      return a($$2 -> new eqh($$2, $$1, 0L, $$0.a()));
   }

   public static epw.a<?> a(dno<?> $$0, akg<eoq> $$1, long $$2) {
      return a($$3 -> new eqh($$3, $$1, $$2, $$0.a()));
   }
}
