import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class ctk extends efw {
   public static final String a = "chunks";
   private static final String b = "Forced";
   private final LongSet c;

   public static efw.a<ctk> a() {
      return new efw.a<>(ctk::new, ctk::b, avw.i);
   }

   private ctk(LongSet $$0) {
      this.c = $$0;
   }

   public ctk() {
      this(new LongOpenHashSet());
   }

   public static ctk b(sn $$0) {
      return new ctk(new LongOpenHashSet($$0.o("Forced")));
   }

   @Override
   public sn a(sn $$0) {
      $$0.a("Forced", this.c.toLongArray());
      return $$0;
   }

   public LongSet b() {
      return this.c;
   }
}
