public interface etg extends epg {
   float b(epf var1);

   default int a(epf $$0) {
      return Math.round(this.b($$0));
   }

   etf b();
}
