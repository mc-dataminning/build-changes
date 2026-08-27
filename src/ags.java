import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class ags implements ze<agd> {
   public static final yv<wi, ags> a = ze.a(ags::a, ags::new);
   private static final int b = 128;
   private static final yv<wi, Int2ObjectMap<cto>> c = yt.a(Int2ObjectOpenHashMap::new, yt.d.a(Short::intValue, Integer::shortValue), cto.e, 128);
   private final int d;
   private final int e;
   private final int f;
   private final int g;
   private final cpc h;
   private final cto i;
   private final Int2ObjectMap<cto> j;

   public ags(int $$0, int $$1, int $$2, int $$3, cpc $$4, cto $$5, Int2ObjectMap<cto> $$6) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = Int2ObjectMaps.unmodifiable($$6);
   }

   private ags(wi $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = $$0.readByte();
      this.h = $$0.b(cpc.class);
      this.j = Int2ObjectMaps.unmodifiable(c.decode($$0));
      this.i = cto.e.decode($$0);
   }

   private void a(wi $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      $$0.k(this.g);
      $$0.a(this.h);
      c.encode($$0, this.j);
      cto.e.encode($$0, this.i);
   }

   @Override
   public zg<ags> a() {
      return agb.br;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.g;
   }

   public cto g() {
      return this.i;
   }

   public Int2ObjectMap<cto> h() {
      return this.j;
   }

   public cpc i() {
      return this.h;
   }

   public int j() {
      return this.e;
   }
}
