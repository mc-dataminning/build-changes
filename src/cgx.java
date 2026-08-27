import com.mojang.serialization.Codec;
import java.util.EnumMap;
import java.util.function.Supplier;

public enum cgx implements asu, cgw {
   a("leather", 5, ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 1);
      $$0.put(cgv.a.c, 2);
      $$0.put(cgv.a.b, 3);
      $$0.put(cgv.a.a, 1);
   }), 15, apg.ai, 0.0F, 0.0F, () -> cmm.a(cjo.pP)),
   b("chainmail", 15, ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 1);
      $$0.put(cgv.a.c, 4);
      $$0.put(cgv.a.b, 5);
      $$0.put(cgv.a.a, 2);
   }), 12, apg.ac, 0.0F, 0.0F, () -> cmm.a(cjo.nQ)),
   c("iron", 15, ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 2);
      $$0.put(cgv.a.c, 5);
      $$0.put(cgv.a.b, 6);
      $$0.put(cgv.a.a, 2);
   }), 9, apg.ah, 0.0F, 0.0F, () -> cmm.a(cjo.nQ)),
   d("gold", 7, ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 1);
      $$0.put(cgv.a.c, 3);
      $$0.put(cgv.a.b, 5);
      $$0.put(cgv.a.a, 2);
   }), 25, apg.ag, 0.0F, 0.0F, () -> cmm.a(cjo.nU)),
   e("diamond", 33, ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 3);
      $$0.put(cgv.a.c, 6);
      $$0.put(cgv.a.b, 8);
      $$0.put(cgv.a.a, 3);
   }), 10, apg.ad, 2.0F, 0.0F, () -> cmm.a(cjo.nK)),
   f("turtle", 25, ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 2);
      $$0.put(cgv.a.c, 5);
      $$0.put(cgv.a.b, 6);
      $$0.put(cgv.a.a, 2);
   }), 9, apg.ak, 0.0F, 0.0F, () -> cmm.a(cjo.nD)),
   g("netherite", 37, ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 3);
      $$0.put(cgv.a.c, 6);
      $$0.put(cgv.a.b, 8);
      $$0.put(cgv.a.a, 3);
   }), 15, apg.aj, 3.0F, 0.1F, () -> cmm.a(cjo.nV));

   public static final Codec<cgx> h = asu.a(cgx::values);
   private static final EnumMap<cgv.a, Integer> i = ac.a(new EnumMap<>(cgv.a.class), $$0 -> {
      $$0.put(cgv.a.d, 13);
      $$0.put(cgv.a.c, 15);
      $$0.put(cgv.a.b, 16);
      $$0.put(cgv.a.a, 11);
   });
   private final String j;
   private final int k;
   private final EnumMap<cgv.a, Integer> l;
   private final int m;
   private final apf n;
   private final float o;
   private final float p;
   private final arw<cmm> q;

   private cgx(String $$0, int $$1, EnumMap<cgv.a, Integer> $$2, int $$3, apf $$4, float $$5, float $$6, Supplier<cmm> $$7) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
      this.n = $$4;
      this.o = $$5;
      this.p = $$6;
      this.q = new arw<>($$7);
   }

   @Override
   public int a(cgv.a $$0) {
      return i.get($$0) * this.k;
   }

   @Override
   public int b(cgv.a $$0) {
      return this.l.get($$0);
   }

   @Override
   public int a() {
      return this.m;
   }

   @Override
   public apf b() {
      return this.n;
   }

   @Override
   public cmm d() {
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
