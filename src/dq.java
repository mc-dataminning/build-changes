import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends dw<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(ark $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bg> b) implements dw.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dq.a::a)).apply($$0, dq.a::new));

      public static ao<dq.a> a(df.a $$0) {
         return an.q.a(new dq.a(Optional.of(bv.a(bv.a.a().a($$0)))));
      }

      public static ao<dq.a> a(bv.a $$0) {
         return an.q.a(new dq.a(Optional.of(bv.a($$0.b()))));
      }

      public static ao<dq.a> a(Optional<bv> $$0) {
         return an.q.a(new dq.a(bv.a($$0)));
      }

      public static ao<dq.a> b() {
         return an.r.a(new dq.a(Optional.empty()));
      }

      public static ao<dq.a> c() {
         return an.I.a(new dq.a(Optional.empty()));
      }

      public static ao<dq.a> d() {
         return an.ab.a(new dq.a(Optional.empty()));
      }

      public static ao<dq.a> e() {
         return an.x.a(new dq.a(Optional.empty()));
      }

      public static ao<dq.a> a(jp<dhm> $$0, jp<cvn> $$1, dhm $$2, cvn $$3) {
         return a(bv.a.a().a(bs.a.a().d(cs.a.a().a($$1, $$3))).b(df.a.a().a(aw.a.a().a($$0, $$2))));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
