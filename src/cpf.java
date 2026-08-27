import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class cpf extends ebg {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static ebg.a<cpf> a() {
      return new ebg.a<>(cpf::new, cpf::b, asq.m);
   }

   private cpf(LongSet $$0) {
      this.c = $$0;
   }

   public cpf() {
      this(new LongOpenHashSet());
   }

   public static cpf b(qs $$0) {
      return new cpf(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public qs a(qs $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
