import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public record ahq(int b, int c, short d, byte e, cwm f, Int2ObjectMap<wb> g, wb h) implements zo<aha> {
   private static final int i = 128;
   private static final ze<wp, Int2ObjectMap<wb>> j = zc.a(Int2ObjectOpenHashMap::new, zc.e.a(Short::intValue, Integer::shortValue), wb.b, 128);
   public static final ze<wp, ahq> a = ze.a(zc.x, ahq::b, zc.h, ahq::e, zc.e, ahq::f, zc.c, ahq::g, cwm.h, ahq::h, j, ahq::i, wb.b, ahq::j, ahq::new);

   public ahq(int b, int c, short d, byte e, cwm f, Int2ObjectMap<wb> g, wb h) {
      g = Int2ObjectMaps.unmodifiable(g);
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
      this.f = f;
      this.g = g;
      this.h = h;
   }

   @Override
   public zq<ahq> a() {
      return agy.bz;
   }

   public void a(aha $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public short f() {
      return this.d;
   }

   public byte g() {
      return this.e;
   }

   public cwm h() {
      return this.f;
   }

   public Int2ObjectMap<wb> i() {
      return this.g;
   }

   public wb j() {
      return this.h;
   }
}
