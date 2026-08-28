import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record epm(List<epm.a> c, eqd d) {
   public static final Codec<epm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epm.a.a.listOf().fieldOf("structures").forGetter(epm::a), eqd.b.fieldOf("placement").forGetter(epm::b)).apply($$0, epm::new)
   );
   public static final Codec<js<epm>> b = akz.a(me.bb, a);

   public epm(js<epg> $$0, eqd $$1) {
      this(List.of(new epm.a($$0, 1)), $$1);
   }

   public static epm.a a(js<epg> $$0, int $$1) {
      return new epm.a($$0, $$1);
   }

   public static epm.a a(js<epg> $$0) {
      return new epm.a($$0, 1);
   }

   public List<epm.a> a() {
      return this.c;
   }

   public eqd b() {
      return this.d;
   }

   public static record a(js<epg> b, int c) {
      public static final Codec<epm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(epg.b.fieldOf("structure").forGetter(epm.a::a), ays.m.fieldOf("weight").forGetter(epm.a::b)).apply($$0, epm.a::new)
      );

      public js<epg> a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }
   }
}
