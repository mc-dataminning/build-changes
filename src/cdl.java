import java.util.EnumMap;
import java.util.function.Supplier;

public enum cdl implements apr, cdk {
   a("leather", 5, ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 1);
      $$0.put(cdj.a.c, 2);
      $$0.put(cdj.a.b, 3);
      $$0.put(cdj.a.a, 1);
   }), 15, amh.ai, 0.0F, 0.0F, () -> ciz.a(cgc.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 1);
      $$0.put(cdj.a.c, 4);
      $$0.put(cdj.a.b, 5);
      $$0.put(cdj.a.a, 2);
   }), 12, amh.ac, 0.0F, 0.0F, () -> ciz.a(cgc.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 2);
      $$0.put(cdj.a.c, 5);
      $$0.put(cdj.a.b, 6);
      $$0.put(cdj.a.a, 2);
   }), 9, amh.ah, 0.0F, 0.0F, () -> ciz.a(cgc.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 1);
      $$0.put(cdj.a.c, 3);
      $$0.put(cdj.a.b, 5);
      $$0.put(cdj.a.a, 2);
   }), 25, amh.ag, 0.0F, 0.0F, () -> ciz.a(cgc.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 3);
      $$0.put(cdj.a.c, 6);
      $$0.put(cdj.a.b, 8);
      $$0.put(cdj.a.a, 3);
   }), 10, amh.ad, 2.0F, 0.0F, () -> ciz.a(cgc.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 2);
      $$0.put(cdj.a.c, 5);
      $$0.put(cdj.a.b, 6);
      $$0.put(cdj.a.a, 2);
   }), 9, amh.ak, 0.0F, 0.0F, () -> ciz.a(cgc.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 3);
      $$0.put(cdj.a.c, 6);
      $$0.put(cdj.a.b, 8);
      $$0.put(cdj.a.a, 3);
   }), 15, amh.aj, 3.0F, 0.1F, () -> ciz.a(cgc.nV));

   public static final apr.a<cdl> h = apr.a(cdl::values);
   private static final EnumMap<cdj.a, Integer> i = ac.a(new EnumMap<>(cdj.a.class), $$0 -> {
      $$0.put(cdj.a.d, 13);
      $$0.put(cdj.a.c, 15);
      $$0.put(cdj.a.b, 16);
      $$0.put(cdj.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cdj.a, Integer> l;
   private final int m;
   private final amg n;
   private final float o;
   private final float p;
   private final aov<ciz> q;

   private cdl(String $$0, int $$1, EnumMap<cdj.a, Integer> $$2, int $$3, amg $$4, float $$5, float $$6, Supplier<ciz> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new aov<>($$7);
   }

   @Override
   public int a(cdj.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cdj.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public amg b() {
      return this.n;
   }

   @Override
   public ciz d() {
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
