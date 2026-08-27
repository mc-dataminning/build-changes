import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum ckt implements avl, cks {
   a("leather", 5, ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 1);
      $$0.put(ckr.a.c, 2);
      $$0.put(ckr.a.b, 3);
      $$0.put(ckr.a.a, 1);
   }), 15, art.as, 0.0F, 0.0F, () -> cqh.a(cnj.qC)),
   b("chainmail", 15, ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 1);
      $$0.put(ckr.a.c, 4);
      $$0.put(ckr.a.b, 5);
      $$0.put(ckr.a.a, 2);
   }), 12, art.am, 0.0F, 0.0F, () -> cqh.a(cnj.oD)),
   c("iron", 15, ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 2);
      $$0.put(ckr.a.c, 5);
      $$0.put(ckr.a.b, 6);
      $$0.put(ckr.a.a, 2);
   }), 9, art.ar, 0.0F, 0.0F, () -> cqh.a(cnj.oD)),
   d("gold", 7, ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 1);
      $$0.put(ckr.a.c, 3);
      $$0.put(ckr.a.b, 5);
      $$0.put(ckr.a.a, 2);
   }), 25, art.aq, 0.0F, 0.0F, () -> cqh.a(cnj.oH)),
   e("diamond", 33, ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 3);
      $$0.put(ckr.a.c, 6);
      $$0.put(ckr.a.b, 8);
      $$0.put(ckr.a.a, 3);
   }), 10, art.an, 2.0F, 0.0F, () -> cqh.a(cnj.ox)),
   f("turtle", 25, ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 2);
      $$0.put(ckr.a.c, 5);
      $$0.put(ckr.a.b, 6);
      $$0.put(ckr.a.a, 2);
   }), 9, art.au, 0.0F, 0.0F, () -> cqh.a(cnj.oo)),
   g("netherite", 37, ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 3);
      $$0.put(ckr.a.c, 6);
      $$0.put(ckr.a.b, 8);
      $$0.put(ckr.a.a, 3);
   }), 15, art.at, 3.0F, 0.1F, () -> cqh.a(cnj.oI));

   public static final Codec<ckt> h = avl.a(ckt::values);
   private static final EnumMap<ckr.a, Integer> i = ac.a(new EnumMap<>(ckr.a.class), $$0 -> {
      $$0.put(ckr.a.d, 13);
      $$0.put(ckr.a.c, 15);
      $$0.put(ckr.a.b, 16);
      $$0.put(ckr.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<ckr.a, Integer> l;
   private final int m;
   private final ars n;
   private final float o;
   private final float p;
   private final auk<cqh> q;

   private ckt(String $$0, int $$1, EnumMap<ckr.a, Integer> $$2, int $$3, ars $$4, float $$5, float $$6, Supplier<cqh> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new auk<>($$7);
   }

   @Override
   public int a(ckr.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(ckr.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public ars b() {
      return this.n;
   }

   @Override
   public cqh d() {
      return this.q.a();
   }

   @Override
   public String e() {
      return this.j;
   }

   @Override
   public float f() {
      return this.o;
   }

   @Override
   public float g() {
      return this.p;
   }

   @Override
   public String c() {
      return this.j;
   }
}
