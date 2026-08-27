import java.util.EnumMap;
import java.util.function.Supplier;

public enum cgr implements asp, cgq {
   a("leather", 5, ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 1);
      $$0.put(cgp.a.c, 2);
      $$0.put(cgp.a.b, 3);
      $$0.put(cgp.a.a, 1);
   }), 15, ape.ai, 0.0F, 0.0F, () -> cmg.a(cji.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 1);
      $$0.put(cgp.a.c, 4);
      $$0.put(cgp.a.b, 5);
      $$0.put(cgp.a.a, 2);
   }), 12, ape.ac, 0.0F, 0.0F, () -> cmg.a(cji.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 2);
      $$0.put(cgp.a.c, 5);
      $$0.put(cgp.a.b, 6);
      $$0.put(cgp.a.a, 2);
   }), 9, ape.ah, 0.0F, 0.0F, () -> cmg.a(cji.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 1);
      $$0.put(cgp.a.c, 3);
      $$0.put(cgp.a.b, 5);
      $$0.put(cgp.a.a, 2);
   }), 25, ape.ag, 0.0F, 0.0F, () -> cmg.a(cji.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 3);
      $$0.put(cgp.a.c, 6);
      $$0.put(cgp.a.b, 8);
      $$0.put(cgp.a.a, 3);
   }), 10, ape.ad, 2.0F, 0.0F, () -> cmg.a(cji.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 2);
      $$0.put(cgp.a.c, 5);
      $$0.put(cgp.a.b, 6);
      $$0.put(cgp.a.a, 2);
   }), 9, ape.ak, 0.0F, 0.0F, () -> cmg.a(cji.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 3);
      $$0.put(cgp.a.c, 6);
      $$0.put(cgp.a.b, 8);
      $$0.put(cgp.a.a, 3);
   }), 15, ape.aj, 3.0F, 0.1F, () -> cmg.a(cji.nV));

   public static final asp.a<cgr> h = asp.a(cgr::values);
   private static final EnumMap<cgp.a, Integer> i = ac.a(new EnumMap<>(cgp.a.class), $$0 -> {
      $$0.put(cgp.a.d, 13);
      $$0.put(cgp.a.c, 15);
      $$0.put(cgp.a.b, 16);
      $$0.put(cgp.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cgp.a, Integer> l;
   private final int m;
   private final apd n;
   private final float o;
   private final float p;
   private final ars<cmg> q;

   private cgr(String $$0, int $$1, EnumMap<cgp.a, Integer> $$2, int $$3, apd $$4, float $$5, float $$6, Supplier<cmg> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new ars<>($$7);
   }

   @Override
   public int a(cgp.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cgp.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public apd b() {
      return this.n;
   }

   @Override
   public cmg d() {
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
